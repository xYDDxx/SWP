function generate(){
    let number1 = document.getElementById("field1").value;
    let number2 = document.getElementById("field2").value;

    number1 = parseFloat(number1);
    number2 = parseFloat(number2);

    let amrdnm = number2 - number1;

    let randomnumber = Math.floor(Math.random() * amrdnm) + number1 + 1;
    document.getElementById("output").value = randomnumber

    
}