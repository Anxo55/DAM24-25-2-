function saludar(texto) {
    console.log('Hola', texto)
}

saludar('Angel')

function eleva(a, b) {  // <= Este no se podrá usar mas
    console.log(a**b)
}

function eleva(a) {
    console.log(a**2)
}

let eleva_2 = function (numero1, numero2)  {
    return numero1**2
}

let eleva_3 = (numero1) => {
    return numero1**2
}

let eleva_4 = (numero1) => numero1**2

console.log(eleva(3))
console.log(eleva_2(3))
console.log(eleva_3(3))
console.log(eleva_4(3))

function saluda() {
    console.log('Hola')
    // return undefined
}

function divide(numero1=1) {
    return numero1/2
}

console.log(divide())
