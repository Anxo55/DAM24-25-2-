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

// Unicamente va a ejecutar la utima funcion pasada
eleva(2, 3) //=> 8
eleva(2)    //=> 4

let divide = function(numero1, numero2)  {
    return numero1/numero2
}

divide(6, 2)