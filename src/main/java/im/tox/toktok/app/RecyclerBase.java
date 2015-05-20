package im.tox.toktok.app;

import android.support.v7.widget.RecyclerView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import im.tox.toktok.R;

import java.util.ArrayList;

public class RecyclerBase extends RecyclerView.Adapter<RecyclerBase.ViewHolder> {

  private final ArrayList<String> list = new ArrayList<String>();
  private final ViewHolder.ClickListener clickListener;
  private final SparseBooleanArray selectedItems = new SparseBooleanArray();


  public RecyclerBase(ViewHolder.ClickListener clickListener) {
    this.clickListener = clickListener;

    for(int i = 0; i<10; i++){
      list.add("Test "+i);
    }
  }

  // RecyclerBase Methods

  public void removeItems(int i) {
    list.remove(i);
    notifyItemRemoved(i);
  }

  public String getItem(int i) {
    return list.get(i);
  }


  public int getItemCount() {
    return list.size();
  }

  //Selectable Methods

  public boolean isSelected(int i) {
    return getSelectedItems().contains(i);
  }

  public void toogleSelection(int i) {
    if (selectedItems.get(i, false)) {
      selectedItems.delete(i);
    } else {
      selectedItems.put(i,true);
    }
    notifyItemChanged(i);
  }

  public void clearSelection() {
    for (Integer i : getSelectedItems()) {
      notifyItemChanged(i);
    }
    selectedItems.clear();;
  }

  public int getSelectedItemCount() {
    return selectedItems.size();
  }

  public ArrayList<Integer> getSelectedItems() {
    ArrayList<Integer> items = new ArrayList<Integer>(selectedItems.size());
    for (int i = 0; i < selectedItems.size(); ++i) {
      items.add(selectedItems.keyAt(i));
    }
    return items;
  }

  //View Methods

  public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
    return new ViewHolder(v,clickListener);
  }

  public void onBindViewHolder(ViewHolder holder, int i) {
    String item = list.get(i);
    holder.title.setText(item);
    holder.selectedOverlay.setVisibility(isSelected(i) ? View.VISIBLE : View.INVISIBLE);
  }

  //Class Implementation

  public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
    private final ClickListener listener;
    private final TextView title;
    private final View selectedOverlay;

    public ViewHolder(View v, ClickListener listener) {
      super(v);

      title = (TextView)v.findViewById(R.id.recy_text);
      selectedOverlay = v.findViewById(R.id.selected_overlay);
      this.listener = listener;

      v.setOnClickListener(this);
      v.setOnLongClickListener(this);
    }

    public void onClick(View v) {
      if (listener != null) {
        listener.onItemClicked(getPosition());
      }
    }

    public boolean onLongClick(View v) {
      return listener != null && listener.onItemLongClicked(getPosition());
    }

    public interface ClickListener {
      void onItemClicked(int position);
      boolean onItemLongClicked(int position);
    }
  }

}
