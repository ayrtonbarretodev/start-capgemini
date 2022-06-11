package br.com.capgemini.exercicios_poo.ex10.enums;

public enum Posicao {
    DEFENSOR{
        @Override
        public Integer getIdadeAposentadoria() {
            return 40;
        }
    },
    MEIOCAMPO{
        @Override
        public Integer getIdadeAposentadoria() {
            return 38;
        }
    },
    ATACANTE{
        @Override
        public Integer getIdadeAposentadoria() {
            return 35;
        }
    };

    public abstract Integer getIdadeAposentadoria();
}
