var people = [
    { "firstname": "Joe", "lastname": "Mama", "img": "<img src='/Java/Card/Sus.png' alt='sus'/>", "age": "69 years old" },
    { "firstname": "Candice", "lastname": "Deez", "img": "<img src='/Java/Card/Sus2.jpg' alt='sus'/>", "age": "9 years old" }
];

var html = "";

for (i = 0; i < people.length; i++) {
    html += "<div class='card'>";
    html += "<div class='main'> <ul><li>" + people[i].firstname + "</li><li>" + people[i].lastname + "</li>" + "</ul>" + "</div>";
    html += "<div class='img' >" + people[i].img + "</div>";
    html += "<div class='side'>" + people[i].age + "</div>";
    html += "</div>";
};

document.getElementById("wrapper").innerHTML = html;