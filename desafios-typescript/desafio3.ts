
let botaoAtualizar = document.getElementById('atualizar-saldo') as HTMLButtonElement;
let botaoLimpar = document.getElementById('limpar-saldo') as HTMLButtonElement;
let soma = document.getElementById('soma') as HTMLInputElement;
let campoSaldo = document.getElementById('campo-saldo') as HTMLElement;

let saldoTotal = 0;

limparSaldo();

function somarAoSaldo(soma: number) {
    if(campoSaldo) {
        let saldoAtual: number = Number(campoSaldo.innerHTML);
        saldoAtual += soma;
        campoSaldo.innerHTML = saldoAtual.toString();
    }
}

function limparSaldo() {
    if(campoSaldo) {
        saldoTotal = 0;
        campoSaldo.innerHTML = saldoTotal.toString();
    }
}

function atualizarSaldo() {
    if(soma) {
        let valor = Number(soma.value);
        soma.value = "";
        if(!isNaN(valor)) {
            somarAoSaldo(valor);
        }
    }
}

if(botaoAtualizar) {
    botaoAtualizar.addEventListener('click', () => {
        atualizarSaldo()
    });
}


if(botaoLimpar) {
    botaoLimpar.addEventListener('click',() => {
        limparSaldo();
    });
}
