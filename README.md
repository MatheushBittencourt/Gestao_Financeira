+---------------------+
|        Gasto           |
+---------------------+
| - tipo : String           |
| - data : date          |
| - valor : float        |
| - forma_pagamento : String|
+---------------------+
| + getTipo() -> String          |
| + getData() -> Date         |
| + getValor() -> float       |
| + getFormaPagamento() -> String|
+---------------------+

+---------------------+
|        Ganho         |
+---------------------+
| - tipo : String      |
| - data : Date        |
| - valor : float      |
+---------------------+
| + getTipo() -> String   |
| + getData() -> Date  |
| + getValor() -> float|
+---------------------+

+----------------------+
|       Relatório                   |
+----------------------+
| - gastos : List[Gasto]            |
| - ganhos : List[Ganho]            |
+----------------------+
| + adicionarGasto(gasto:Gasto)     |
| + adicionarGanho(ganho:Ganho)     |
| + calcularTotalGastos() -> float  |
| + calcularTotalGanhos() -> float  |
| + gerarRelatorioGastos() -> String|
| + gerarRelatorioGanhos() -> String|
| + gerarRelatorioSaldo() -> String |
+----------------------+
