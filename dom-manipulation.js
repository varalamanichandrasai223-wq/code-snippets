// dom-manipulation.js
// Basic examples of DOM manipulation using JavaScript

// Select an element by its ID
const heading = document.getElementById("heading");

// Change the text of the element
if (heading) {
    heading.textContent = "Hello, JavaScript!";
}

// Change the style of an element
if (heading) {
    heading.style.color = "blue";
}


// Create a new paragraph
const paragraph = document.createElement("p");

paragraph.textContent = "This paragraph was created using JavaScript.";

// Add the paragraph to the webpage
document.body.appendChild(paragraph);


// Add a button click event
const button = document.getElementById("myButton");

if (button) {
    button.addEventListener("click", function () {
        alert("Button clicked!");
    });
}
