
// Primero el elemento se coloca donde vamos a intereactuar y luego donde saldrá el mensaje.

document.getElementById('miboton').addEventListener('click', saludar)
    function saludar() {
        document.getElementById('frase').innerHTML= 'Hola'
        confetti()
    }



// si lo ponemos con parentesis es un indefined, que saldria ya el mensaje al salir.
// saludar()