let traduccion = new Map()

traduccion.set('Hola', 'Hello')
traduccion.set('Mesa', 'Table') 

console.log(traduccion)

console.log(traduccion.get('Mesa'))

let personas = new Map(
    [
        ['Pepe', 'Casado'],
        ['Isabel', 'Soltera'],
        ['Angel', 'Casado'],
        ['Antonio', 'Casado'],
    ]
)

console.log(personas)

console.log(personas.has('Antonio'))
console.log(personas.get('Antonio'))

personas.delete('Pepe')

console.log(personas.size)

for(let [key, value] of personas) {
    console.log(key, value)
}

for(let nombre of personas.key()) {
    console.log(nombre)
}

for(let estado of personas.values()) {
    console.log(estado)
}

for(let persona of personas.entries()) { 
    console.log(persona)
}

let coche = {
    marca: 'Ford',
    modelo: 'Mustang'
}

let moto = new Map()
moto.set('marca', 'Ninja')
moto.set('marca', 'Rossi')

