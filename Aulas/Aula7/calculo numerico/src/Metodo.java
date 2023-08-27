import java.util.List;

public class Metodo {


     /*Método de interpolação de Lagrange*/
   public List<Integer> xs = [0, 20, 40, 60, 80, 100];
    public int ys = [26.0, 42.6, 61.6, 71.2, 74.8, 75.2];

    x = float(input('Informe o x: '))

    n = len(xs)-1

    y = 0 # elemento neutro da soma

for i in range(n+1):
    L = 1 # elemento neutro do produto
  for j in range(n+1):
            if j != i:
    L = L*(x-xs[j])/(xs[i]-xs[j])
    y = y + ys[i]*L

    print('y =', y)


# Exercício - codificar a interpolação linear
    xs = [40, 60]
    ys = [61.6, 71.2]
    x = float(input('Informe o x: '))
}
