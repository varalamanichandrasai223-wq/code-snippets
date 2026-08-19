// fetchAPI.js
// Example of using the Fetch API to retrieve data

// API URL
const apiURL = "https://jsonplaceholder.typicode.com/users";

// Fetch data from the API
fetch(apiURL)
    .then(response => {
        // Check whether the request was successful
        if (!response.ok) {
            throw new Error("Network response was not successful");
        }

        // Convert response to JSON
        return response.json();
    })
    .then(data => {
        // Display the received data
        console.log("User data:");

        data.forEach(user => {
            console.log("Name:", user.name);
            console.log("Email:", user.email);
            console.log("-------------------");
        });
    })
    .catch(error => {
        // Handle errors
        console.error("Error fetching data:", error);
    });
