const  [a,b=8] = [2]
console.log(a,b)

let usuario = {
    nombre: 'pepe',
    email: 'Pepe@gmail.com',
    edad: 20,
    direccion: 'Pizarro'
}

// let nombre 
let nombre 
({nombre} = usuario)

console.log(nombre)

function f() {
    return [3, 6,'hola']
}

// const numero = f()[0]
// const texto = f()[1]

const[numero, , texto,] = f()
console.log(numero, texto)

const info = {
    "codigo-barras": '325587455',
    nombre: 'Producto'
}

const {"codido-barras": codigoBarras} = info
console.log(codigoBarras)



const alumnos = [
    {nombre: 'Pepe', edad: 20},
    {nombre: 'Angel', edad:21}
]

// const edad = alumnos[1].edad
const [ , {edad} ] = alumnos
console.log(edad)


const empleado = {
    nombre: 'Pedro',
    direccion: {
        calle: 'Pizarro',
        numero: 123
    }
}

// const calle = empleado.direccion.calle
const {direccion: {calle}} = empleado
const {direccion:{...datosDireccion}} = empleado
console.log(calle)
console.log(datosDireccion)


