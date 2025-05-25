## Resposta questão 1:

A) Verdadeira. Construtores não são herdados por subclasses. A subclasse precisa definir seu próprio construtor e pode chamar o da superclasse usando super().

B) Falsa. O relacionamento "tem um" é feito com composição (um objeto dentro de outro), não com herança. Herança é usada para "é um".

C) Falsa. Quando a subclasse usa o mesmo nome e os mesmos parâmetros de um método da superclasse, isso se chama sobrescrita, não sobrecarga.

## Resposta questão 2:
Alguns evitam usar protected porque ele permite que subclasses acessem diretamente partes internas da superclasse, o que pode quebrar o encapsulamento. Já private protege melhor os dados, mas exige o uso de métodos get e set. protected pode ser útil, mas deve ser usado com cuidado para não deixar o código frágil e difícil de manter.

## Resposta questão 3:
Quando criamos um objeto de uma subclasse, o Java primeiro chama o construtor da superclasse. Isso é necessário porque a subclasse herda coisas da superclasse, e elas precisam ser preparadas antes. Se a superclasse não tiver um construtor vazio, é obrigatório chamar um construtor dela com super(). Isso garante que tudo funcione direito.  
