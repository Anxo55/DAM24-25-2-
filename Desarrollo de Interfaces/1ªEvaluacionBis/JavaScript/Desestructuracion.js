let nombres = ['Paula', 'Manuel', 'Pepe', 'Angel']

// let a = nombres[0]
// let b = nombres[1]

let [a,b, ...rest] = nombres

console.log(a,b)
console.log(rest)

let usuario = {
    nombre: 'Pepe',
    email: 'pepe@gmail.com',
    edad: 30,
    direccion: 'Pizarro'
}

// let n = usuario.nombre
// let e= usuario.email

const {nombre:n ,email:e, ...rest2} = usuario

console.log(n,e)
console.log(rest2)
