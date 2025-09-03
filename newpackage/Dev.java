package newpackage;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(Conteudo conteudo) {
    if (this.conteudosInscritos.contains(conteudo)) {
        this.conteudosConcluidos.add(conteudo);
        this.conteudosInscritos.remove(conteudo);
    } else {
        System.err.println("O Dev " + this.nome + " n�o est� inscrito neste conte�do!");
    }
}

    public double calcularTotalXp() {
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return nome.equals(dev.nome) &&
               conteudosInscritos.equals(dev.conteudosInscritos) &&
               conteudosConcluidos.equals(dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
    
    @Override
    public String toString() {
        return "Dev{" +
            "nome='" + nome + '\'' +
            ", conteudosInscritos=" + conteudosInscritos +
            ", conteudosConcluidos=" + conteudosConcluidos +
            '}';
}
}