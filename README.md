# Teste Técnico – Cálculo de Lotação Máxima

## Explicação Técnica

Para resolver o problema, ordenei as listas de horários de entrada e saída dos passageiros.

Depois disso, percorri as duas listas ao mesmo tempo utilizando dois ponteiros:
. Um ponteiro para as entradas
. Um ponteiro para as saídas

A cada comparação:

. Se o horário de entrada for menor que o horário de saída, significa que uma pessoa entrou antes de outra sair. Nesse caso, aumento o contador de pessoas na sala.
. Caso contrário, significa que alguém saiu antes ou no mesmo momento da próxima entrada. Então diminuo o contador.

Durante o percurso, armazeno o maior valor que o contador atinge. Esse valor representa a lotação máxima da sala.

## Explicação para o Cliente

O sistema analisa os horários de entrada e saída dos passageiros na sala de espera.

Com base nesses horários, ele identifica quantas pessoas estavam presentes em cada momento e determina qual foi o maior número de passageiros ao mesmo tempo.

Também foi considerado o caso em que uma pessoa sai exatamente no mesmo instante em que outra entra. Nessa situação, a quantidade de pessoas na sala não aumenta.

Ao final, o sistema informa qual foi a maior ocupação da sala no período analisado. Essa informação pode ser usada para avaliar se o espaço atual é suficiente ou se precisa ser redimensionado.
