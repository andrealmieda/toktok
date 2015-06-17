(function(window, undefined) {
  var dictionary = {
    "e1c3b26b-7a6e-4d6a-94d0-c0728134abd5": "initial_screen_chats_delete_group",
    "15b433ad-64b2-4486-9452-160468973612": "initial_screen_chats_delete",
    "afcf4a51-1345-4643-a8c6-ce7e47cec316": "initial_screen_friends_request_accepted",
    "44f83fc5-1981-49f1-bedd-4831e9d5419d": "contacts_messaging",
    "c6808be5-3948-463f-b287-a9051b2afcee": "initial_screen_friends",
    "d12245cc-1680-458d-89dd-4f0d7fb22724": "Initial_screen_chats",
    "f1470dfd-e81f-4b43-a7dc-2e3c5105f2f1": "initial_screen_chats_deleted",
    "99f20218-66c3-4631-9d73-f308cce1d7b4": "contacts_details",
    "0e9cd6d5-cbda-4525-93aa-e054a7274c78": "initial_screen_friends_request",
    "30434c7f-7ac6-4950-8f36-7ba406a9e7b1": "initial_screen_chats_selected",
    "79be020d-37ae-45d8-b13a-dc874838234e": "initial_screen_friends_request_declined",
    "f39803f7-df02-4169-93eb-7547fb8c961a": "Template 1"
  };

  var uriRE = /^(\/#)?(screens|templates|masters)\/(.*)(\.html)?/;
  window.lookUpURL = function(fragment) {
    var matches = uriRE.exec(fragment || "") || [],
        folder = matches[2] || "",
        canvas = matches[3] || "",
        name, url;
    if(dictionary.hasOwnProperty(canvas)) { /* search by name */
      url = folder + "/" + canvas;
    }
    return url;
  };

  window.lookUpName = function(fragment) {
    var matches = uriRE.exec(fragment || "") || [],
        folder = matches[2] || "",
        canvas = matches[3] || "",
        name, canvasName;
    if(dictionary.hasOwnProperty(canvas)) { /* search by name */
      canvasName = dictionary[canvas];
    }
    return canvasName;
  };
})(window);