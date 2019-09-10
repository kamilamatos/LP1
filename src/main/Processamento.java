package main;

class Processamento {

    public Double calcularTroco(double quantidadeDinheiro,
            double precoProduto) {
        double resp = quantidadeDinheiro - precoProduto;

        return resp;
    }

    public int vernegativos(int valorum, int valordois, int valortres, int valorquatro, int valorcinco) {
        int cont = 0;
        if (valorum < 0) {
            cont += 1;
        }
        if (valordois < 0) {
            cont += 1;
        }
        if (valortres < 0) {
            cont += 1;
        }
        if (valorquatro < 0) {
            cont += 1;
        }
        if (valorcinco < 0) {
            cont += 1;
        }
        return cont;
    }

}
