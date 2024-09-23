let persona = {
    nombre: 'Angel',
    direccion: {
        calle: 'Hispanidad',
        numero: 33
    },
    edad: 30,
    casado: true,

    saludar: function () {
        // console.log('hola soy una persona y me llamo: ' +this.nombre+ ' un saludo.')
        console.log(`Hola soy una persona y me llamo: ${this.nombre} un saludo`)
    }

}

console.log(persona.nombre)
console.log(persona['edad'])

persona.peso = 90
delete persona.casado

console.log(persona)

persona.saludar()

