class Calculator {
    
    public float adição(float num1, float num2) {
        return num1 + num2;
    }

    public float subtração(float num1, float num2) {
        return num1 - num2;
    }

    public float mult(float num1, float num2) {
        return num1 * num2;
    }

    public float div(float num1, float num2) {
        if (num2 == 0) {
            System.out.println("Erro: Divisão por zero!");
            return Float.NaN;
        } else {
            return num1 / num2;
        } 
    }
}