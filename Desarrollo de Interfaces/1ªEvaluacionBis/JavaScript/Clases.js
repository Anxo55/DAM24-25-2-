class Nota {
    constructor(valor) {
        this.valor = valor
    }
    
    calificar() {
        console.log('Calificada')
    }
}

let notaAna = new Nota(6)

console.log(notaAna.valor)
notaAna.calificar()



class Vehiculo {
    constructor(nombre) {
        this.nombre = nombre
    }
}

class Moto extends Vehiculo {
    constructor(nombre, color) {
        super(nombre)
        this.color = color
    }
}

class Coche extends Vehiculo {
    constructor(nombre, color) {
        super(nombre)
        this.color = color
    }
}