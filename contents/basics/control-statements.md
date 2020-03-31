## Controle de Fluxo
Controle de fluxo de uma aplicação se refere às condicionais que são capazes de mudar completamente o fluxo de execução de uma aplicação. Você talvez conheça esse termo de uma forma mais prática como os statements `if`, `else`, `else if`, `switch` e afins. Todos esses statements serão vistos a seguir: 

### `if`
A forma completa da instrução `if` é: 

```java
	if(condição) instrução;
	else instrução;
```
em que os alvos de `if` e `else` são instruções individuais. A cláusula `else` é opcional. Os alvos tanto de if quanto de else podem ser blocos de instruções. A forma geral de if usando blocos de instruções é: 

```java
	if(condição){
		//sequência de instruções
	} else {
		//sequência de instruções	
	}
```

Se a expressão condicional for verdadeira, o alvo de `if` será executado; caso contrário, se houver, o alvo de `else` será executado. Nunca ambos serão executados. A expressão condicional que controla `if` deve produzir um resultado `boolean`. 

### `Ifs` Aninhados
Um if aninhado é uma instrução if que é alvo de outro if ou else. Os if aninhados são muito comuns em programação porque fornecem uma maneira de fazermos uma nova seleção baseada no resultado da seleção anterior. O importante a lembrar sobre ifs aninhados em Java é que uma instrução else será sempre referente à instrução if mais próxima que estiver dentro do mesmo bloco e ainda não estiver associada a um else. Aqui está um exemplo: 

```java
	if(i == 10){
		if(j < 20) a = b;
		if(k > 100) c = d;
		else a = c; // esse else é referente a if(k > 100)		
	}else a = d; // esse else é referente a if(i == 10)
```

Como os comentários indicam, o `else` final não está associado a `if(j < 20)`, porque não está no mesmo bloco (ainda que esse seja o `if` mais próximo sem um `else`). Em vez disso, o `else` final está associado a `if(i == 10)`. O else interno é referente a `if(k > 100)`, porque esse é o `if` mais próximo dentro do mesmo bloco.

### Escada `if-else-if`

Uma estrutura de programação comum é baseada no if aninhado costuma ser chamada de escada if-else-if. Ela tem a seguinte aparência: 

```java
	if(condição)
		instrução;
	else if(condição)
		instrução;
	else if(condição)
		instrução;
	.
	.
	.
	else
		instrução;	
```

As expressões condicionais são avaliadas de cima para baixo. Assim que uma condição verdadeira é encontrada, a instrução associada a ela é executada e o resto da escada é ignorado. Se nenhuma das condições for verdadeira, a instrução else final será executada. Com frequência, o else final age como uma condição padrão, isto é, se todos os outros testes condicionais falharem, a última instrução else será executada. Se não houver um else final e todas as outras condições forem falsas, não ocorrerá ação alguma. 

```java
	class Ladder{
		public static void main(String [] args){
			int x;

			for(x=0; x<6; x++){
				if(x==1) 
				   System.out.println("X is one");
				else if(x == 2) 
				   System.out.println("X is two");
				else if(x == 3)
				   System.out.println("X is three");
				else if(x == 4)
				   System.out.println("X is four");
				else 
				   System.out.println(X is not between 1 and 4);// Instrução padrão 			
			}
		}	
	}
``` 


