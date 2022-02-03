function registerEvents() {
    document.getElementById("loadTodos").addEventListener("click", function() {
        loadTodos();
    })

    document.getElementById("loadUsers").addEventListener("click", function() {
        loadUsers();
    })
}

function loadTodos() {
    fetch('https://jsonplaceholder.typicode.com/todos')
        .then(function(repsone) {
            return repsone.json();
        })
        .then(function(data) {
            let html = "";
            data.forEach(todo => {
                html += "<li>" + todo.title + "</li>";

            });

            document.getElementById("list").innerHTML = html;
            console.log(html);

        })

    .catch(function(err) {
        console.log(err);

    });
}

function loadUsers() {
    fetch('https://jsonplaceholder.typicode.com/users')
        .then(function(repsone) {
            return repsone.json();
        })
        .then(function(data) {
            let html = "";
            data.forEach(user => {
                html += "<li>" + user.name + "</li>";

            });

            document.getElementById("list").innerHTML = html;
            console.log(html);

        })

    .catch(function(err) {
        console.log(err);

    });
}


registerEvents();