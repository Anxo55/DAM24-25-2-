console.log(typeof 5) //number
console.log(typeof 5.5) //number
console.log(typeof true) //boolean
console.log(typeof 'hola') //string
console.log(typeof {nombre: 'pedro'}) //object
console.log(typeof function() { } ) //function
console.log(typeof null) //null
console.log(typeof undefined) //undefined
console.log(typeof [1,2,3]) //array, pero lo trata como un objeto

class Persona {
    n=5
    constructor(nombre) {
        this.nombre = nombre
    }
}

let pepe = new Persona('pepe')
console.log(pepe instanceof Persona) 



