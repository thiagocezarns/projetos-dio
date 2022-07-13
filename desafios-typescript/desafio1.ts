/*
Como podemos rodar o coóigo abaixo em um arquivo .ts sem causar erros? 

let employee = {};
employee.code = 10;
employee.name = "John";

*/

// Solução 1
let employee: { name: string, code: number } = {
    name: "Thiago",
    code: 1234
};

console.log(employee);

//  Solução 2
interface Employee {
    name: string,
    code: number
}

let employee2: Employee = {
    name: "Cézar",
    code: 1235
}

console.log(employee2);