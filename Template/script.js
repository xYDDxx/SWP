const meals = [
    { name: "Nudeln" }, { name: "Pommes" }, { name: "Gulasch" }
];


function getRandomInt(meals) {
    return Math.floor(Math.random() * max);
}

console.log(getRandomInt(meals));
// expected output: 0, 1 or 2