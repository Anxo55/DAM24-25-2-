function Nota(valor) {
    this.valor = valor

    this.calificar = function() {
        console.log('Calificada')
    }
}


let notaAna = new Nota(7)

console.log(notaAna.valor)

notaAna.calificar()

Nota.prototype.suspender = function() {
    this.valor = 1
}

notaAna.suspender()
console.log(notaAna.valor)