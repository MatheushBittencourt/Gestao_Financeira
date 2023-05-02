+---------------------+
|        Gasto           |
+---------------------+
| - tipo : str           |
| - data : date          |
| - valor : float        |
| - forma_pagamento : str|
+---------------------+
| + getTipo() -> str          |
| + getData() -> date         |
| + getValor() -> float       |
| + getFormaPagamento() -> str|
+---------------------+

+---------------------+
|        Ganho         |
+---------------------+
| - tipo : str         |
| - data : date        |
| - valor : float      |
+---------------------+
| + getTipo() -> str   |
| + getData() -> date  |
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
| + gerarRelatorioGastos() -> string|
| + gerarRelatorioGanhos() -> string|
| + gerarRelatorioSaldo() -> string |
+----------------------+
