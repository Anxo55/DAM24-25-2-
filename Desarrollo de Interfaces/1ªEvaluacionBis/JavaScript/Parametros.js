function procesar(nombre, callback) {
        console.log(callback(nombre));
}

function insulta(nombre) {
    return nombre +' eres tonto'
}

function saluda(nombre) {
    return 'Que tal estas '+nombre
}

procesar('Pepe', insulta)
procesar('Ana', saluda)

procesar('Pepe', function (n) {return 'Que tal las clases ' +n })
procesar('Antonio', n => 'Guapo!! ' +n)

let coche = {
    marca: 'Ford',
    precio: 12000,
}

let alumno = {
    nombre: 'pepe'
}

function reciclar(objeto) {
    console.log('Recicle el coche '+objeto.marca)
}

reciclar(coche)
// sale undefined por que el alumno no tiene marca obviamente
reciclar(alumno)
reciclar(
    {marca: 'Seat',
    precio: 20000
})


