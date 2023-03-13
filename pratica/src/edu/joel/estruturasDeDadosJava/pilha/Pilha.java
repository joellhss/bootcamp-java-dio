package edu.joel.estruturasDeDadosJava.pilha;

public class Pilha {
    private No refNoEntradaPilha = null;
    public void push(int numero) {
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = new No(numero);
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop() {
        if (!this.isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public No top() {
        return refNoEntradaPilha;
    }

    public boolean isEmpty() {
        return refNoEntradaPilha == null;
    }

    @Override
    public String toString() {
      String stringReturn = "-------------\n";
      stringReturn += "    PILHA    \n";
      stringReturn += "-------------\n";

      No auxiliar = refNoEntradaPilha;
      while (true) {
          if(auxiliar != null) {
            stringReturn += "numero: " + auxiliar.getDado() + "\n";
            auxiliar = auxiliar.getRefNo();
          } else {
              break;
          }
      }
      stringReturn += "=============";
      return stringReturn;

    }
}
