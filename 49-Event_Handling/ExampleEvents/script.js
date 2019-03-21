
// Blur
document.getElementById("fname").addEventListener("blur", function (e) {
    this.value = this.value.toUpperCase();
    console.log(e);
});

//Change
var activityField = document.getElementById("activity");
activityField.addEventListener("change", function (event) {
    this.value = this.value.toUpperCase();
    console.log("CHANGED!");
});

//Change
//var programmingLanguageField = document.getElementById("programmingLanguage");
document.getElementById("programmingLanguage").addEventListener("change", function (event) {
    document.getElementById("languageMessage").innerHTML = "You selected " + this.value;
});

//Focus
var usernameField = document.getElementById("username");
usernameField.addEventListener("focus", function (event) {
    this.style.background = "green";
    this.style.color = "white";
});
usernameField.addEventListener("blur", function (event) {
    this.style.background = "white";
    this.style.color = "black";
});

//Select
var messageField = document.getElementById("message");
messageField.addEventListener("select", function (event) {
    document.getElementById("selectedMessage").innerHTML = "You selected the textbox";
});

//keyup
var birthDateField = document.getElementById("birthDate");
birthDateField.addEventListener("keyup", function (event) {
    document.getElementById("lastkey").innerHTML = "The last key was " + event.key;
    document.getElementById("birthdateMessage").innerHTML = this.value;
});

//MouseOver & MouseOut
var mouseOverBox = document.getElementById("mouseover");
mouseOverBox.addEventListener("mouseover", function(event) { 
    this.style.background = "#860036";
});
mouseOverBox.addEventListener("mouseout", function (event) {
    this.style.background = "#F0b212";
});

//MouseDown & MouseUp
var mouseDownBox = document.getElementById("mousedown");
mouseDownBox.addEventListener("mousedown", function (event) {
    this.style.background = "#023264";
});
mouseDownBox.addEventListener("mouseup", function (event) {
    this.style.background = "#CC0000";
});

//Click
var clickBox = document.getElementById("click");
clickBox.addEventListener("click", function (event) {
    this.style.background = "blue";
});

//Double Click
var dblclickBox = document.getElementById("dblclick");
dblclickBox.addEventListener("dblclick", function (event) {
    this.style.background = "green";
});

//Context Menu
var rightclickBox = document.getElementById("rightclick");
rightclickBox.addEventListener("contextmenu", function (event) {
    event.preventDefault();
    this.style.background = "violet";
    return false;
});



/*
    - `this` refers to the DOM element on which the handler was registered
    - `event` is optional and includes information about the event that occurred
*/