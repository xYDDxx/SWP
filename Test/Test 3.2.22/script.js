function calculate() {
    document.getElementById("output").value = "";
    let number = document.getElementById("input").value;

    console.log(number);
    if (number > 0) {
        for (let index = 0; index <= number; index++) {
            console.log(index);
            document.getElementById("output").value += index + ", ";
        }
    } else if (number < 0) {
        for (let index = 0; index >= number; index--) {
            console.log(index);
            document.getElementById("output").value += index + ", ";
        }
    } else { document.getElementById("output").value = ""; }
};