var outputNumber = document.getElementById("number");
var outputText = document.getElementById("text");

function MagicButton() {
    let Größe = document.getElementById("Größe").value;
    let Gewicht = document.getElementById("Gewicht").value;

    let result = (Math.round(((Größe * 1.43) / (Gewicht)) - 3.4))

    calc(result);
}

function calc(result) {
    document.getElementById("output").value = "";
    if (result > 0) {
        document.getElementById("output").value += "positiv, "
        for (let index = 0; index <= result; index++) {
            console.log(index);
            document.getElementById("output").value += index + ", ";
        }

    } else if (result < 0) {
        document.getElementById("output").value += "negativ, "
        for (let index = 0; index >= result; index--) {
            console.log(index);
            document.getElementById("output").value += index + ", ";
        }
    } else if (result == 0) {
        document.getElementById("output").value += "null"
    }
};