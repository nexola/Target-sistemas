public class Questao04 {
    public static void main(String[] args) {
        System.out.println("Para resolver esse problema, podemos utilizar a fórmula de distância, que relaciona a distância percorrida por um veículo com sua velocidade e tempo de viagem:\n" +
                "\n" +
                "distância = velocidade x tempo\n" +
                "\n" +
                "Vamos calcular quanto tempo cada veículo leva para chegar ao ponto de cruzamento na rodovia. Sabemos que a distância entre Ribeirão Preto e Franca é de 100 km, e que os veículos estão se aproximando um do outro, então eles se encontram a uma distância igual a essa.\n" +
                "\n" +
                "Para o carro, a velocidade é de 110 km/h, então o tempo de viagem até o ponto de cruzamento é:\n" +
                "\n" +
                "tempo do carro = distância / velocidade\n" +
                "tempo do carro = 100 km / 110 km/h\n" +
                "tempo do carro = 0,91 h\n" +
                "\n" +
                "Para o caminhão, a velocidade é de 80 km/h e ele leva 5 minutos a mais em cada um dos dois pedágios, então o tempo de viagem até o ponto de cruzamento é:\n" +
                "\n" +
                "tempo do caminhão = distância / velocidade + tempo extra dos pedágios\n" +
                "tempo do caminhão = 100 km / 80 km/h + 2 x 5 minutos\n" +
                "tempo do caminhão = 1,25 h\n" +
                "\n" +
                "Agora que sabemos os tempos de viagem de cada veículo, podemos determinar a distância que cada um está da cidade de Ribeirão Preto quando se encontram. Para isso, basta multiplicar a velocidade de cada veículo pelo seu respectivo tempo de viagem:\n" +
                "\n" +
                "distância do carro = 110 km/h x 0,91 h\n" +
                "distância do carro = 100 km\n" +
                "\n" +
                "distância do caminhão = 80 km/h x 1,25 h\n" +
                "distância do caminhão = 100 km\n" +
                "\n" +
                "Portanto, ambos os veículos estarão a uma distância igual de 100 km da cidade de Ribeirão Preto quando se encontrarem. Isso ocorre porque ambos estão percorrendo a mesma distância em direção um ao outro e, como suas velocidades são constantes, eles se encontrarão no ponto médio dessa distância, que fica equidistante das duas cidades. Logo, não há um veículo mais próximo de Ribeirão Preto no momento do encontro.");
    }
}
