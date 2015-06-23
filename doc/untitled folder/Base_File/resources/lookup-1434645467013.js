(function(window, undefined) {
  var dictionary = {
    "0fae4eb4-400c-47a0-a2cb-ce89b6003a26": "initial_screen_chats_addfriends_group_open",
    "d12245cc-1680-458d-89dd-4f0d7fb22724": "Initial_screen_chats",
    "79be020d-37ae-45d8-b13a-dc874838234e": "initial_screen_friends_request_declined",
    "080852d4-45a2-449e-9757-38638fe3942d": "group_message",
    "01116084-c277-4abd-9f1e-1a01b34b3bc7": "call_on_going",
    "5fc65510-a57b-47ac-8e7c-da268d6146dc": "intial_screem_chats_qrcode",
    "30434c7f-7ac6-4950-8f36-7ba406a9e7b1": "initial_screen_chats_selected",
    "e1c3b26b-7a6e-4d6a-94d0-c0728134abd5": "initial_screen_chats_delete_group",
    "99f20218-66c3-4631-9d73-f308cce1d7b4": "contacts_details",
    "2c791922-c952-48b5-a1fc-f0dd6150b117": "initial_screen_chats_addfriends_group",
    "44f83fc5-1981-49f1-bedd-4831e9d5419d": "contacts_messaging",
    "afcf4a51-1345-4643-a8c6-ce7e47cec316": "initial_screen_friends_request_accepted",
    "28744ed8-ff4a-4c92-97a6-fa6bc60d27e3": "initial_screen_friends_request_add_friends_done",
    "8df8f978-0776-438e-b3fe-250fd2b97f76": "initial_screen_chats_addfriends_single",
    "f1470dfd-e81f-4b43-a7dc-2e3c5105f2f1": "initial_screen_chats_deleted",
    "15b433ad-64b2-4486-9452-160468973612": "initial_screen_chats_delete",
    "9ecfa96f-44ff-4e54-9b83-cb3093f7e1df": "initial_screen_chats_addfriends",
    "c0986243-8985-4e28-a78d-3c7380bfa5fb": "video_call",
    "c6808be5-3948-463f-b287-a9051b2afcee": "initial_screen_friends",
    "0e9cd6d5-cbda-4525-93aa-e054a7274c78": "initial_screen_friends_request",
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