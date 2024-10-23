public class Produto {
    private String nome;
    private String codigo;
    private double preco;
    private boolean aprovadoQualidade;

    public Produto() {
        this.nome = "";
        this.codigo = "";
        this.preco = 0.0;
        this.aprovadoQualidade = false;
    }

    public Produto(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = 0.0;
        this.aprovadoQualidade = false;
    }


    public Produto(String nome, String codigo, double preco, boolean aprovadoQualidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.aprovadoQualidade = aprovadoQualidade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isAprovadoQualidade() {
        return aprovadoQualidade;
    }

    public void setAprovadoQualidade(boolean aprovadoQualidade) {
        this.aprovadoQualidade = aprovadoQualidade;
    }
}
import java.time.LocalDate;

public class ProdutoPerecivel extends Produto {
    private LocalDate dataValidade;


    public ProdutoPerecivel() {
        super(); // Chama o construtor padrão da classe Produto
        this.dataValidade = LocalDate.now();
    }


    public ProdutoPerecivel(String nome, String codigo, double preco, boolean aprovadoQualidade, LocalDate dataValidade) {
        super(nome, codigo, preco, aprovadoQualidade);
        this.dataValidade = dataValidade;
    }


    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
}
public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.setNome("Caneta");
        produto1.setCodigo("C123");
        System.out.println("Produto 1: " + produto1.getNome() + ", Código: " + produto1.getCodigo());


        Produto produto2 = new Produto("Lápis", "L456");
        System.out.println("Produto 2: " + produto2.getNome() + ", Código: " + produto2.getCodigo());


        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Leite", "L789", 4.99, true, LocalDate.of(2024, 12, 31));
        System.out.println("Produto Perecível: " + produtoPerecivel.getNome() + ", Validade: " + produtoPerecivel.getDataValidade());
    }
}

public class LinhaDeProducao {
    private String id;
    private String descricao;


    public LinhaDeProducao() {
        this.id = "";
        this.descricao = "";
    }


    public LinhaDeProducao(String id) {
        this.id = id;
        this.descricao = "";
    }


    public LinhaDeProducao(String id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

public class Operario {
    private String nome;
    private String id;
    private LinhaDeProducao linhaDeProducao;


    public Operario() {
        this.nome = "";
        this.id = "";
        this.linhaDeProducao = null;
    }


    public Operario(String nome, String id) {
        this.nome = nome;
        this.id = id;
        this.linhaDeProducao = null;
    }


    public Operario(String nome, String id, LinhaDeProducao linhaDeProducao) {
        this.nome = nome;
        this.id = id;
        this.linhaDeProducao = linhaDeProducao;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LinhaDeProducao getLinhaDeProducao() {
        return linhaDeProducao;
    }

    public void setLinhaDeProducao(LinhaDeProducao linhaDeProducao) {
        this.linhaDeProducao = linhaDeProducao;
}
}

public class RepositorioProdutos {
    private List<Produto> produtos;


    public RepositorioProdutos() {
        this.produtos = new ArrayList<>();
    }


    public RepositorioProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }


    public RepositorioProdutos(RepositorioProdutos outroRepositorio) {
        this.produtos = new ArrayList<>(outroRepositorio.getProdutos());
    }


    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }


    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }


    public void removerProduto(Produto produto) {
        produtos.remove(produto);
}
}

public class OperarioEspecializado extends Operario {
    private String especialidade;

    // Construtores
    public OperarioEspecializado() {
        super();
        this.especialidade = "";
    }

    public OperarioEspecializado(String nome, String id, String especialidade) {
        super(nome, id);
        this.especialidade = especialidade;
    }

    public OperarioEspecializado(String nome, String id, LinhaDeProducao linhaDeProducao, String especialidade) {
        super(nome, id, linhaDeProducao);
        this.especialidade = especialidade;
    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
}
}


public class ServicoPlanejamento {
    private String nomeServico;
    private String responsavel;
    private int duracaoDias;


    public ServicoPlanejamento() {
        this.nomeServico = "";
        this.responsavel = "";
        this.duracaoDias = 0;
    }


    public ServicoPlanejamento(String nomeServico, String responsavel) {
        this.nomeServico = nomeServico;
        this.responsavel = responsavel;
        this.duracaoDias = 0;
    }


    public ServicoPlanejamento(String nomeServico, String responsavel, int duracaoDias) {
        this.nomeServico = nomeServico;
        this.responsavel = responsavel;
        this.duracaoDias = duracaoDias;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public int getDuracaoDias() {
        return duracaoDias;
    }

    public void setDuracaoDias(int duracaoDias) {
        this.duracaoDias = duracaoDias;
}
}
public class ServicoPlanejamentoDetalhado extends ServicoPlanejamento {
    private String materiaisNecessarios;


    public ServicoPlanejamentoDetalhado() {
        super(); 
        this.materiaisNecessarios = "";
    }


    public ServicoPlanejamentoDetalhado(String nomeServico, String responsavel, String materiaisNecessarios) {
        super(nomeServico, responsavel);
        this.materiaisNecessarios = materiaisNecessarios;
    }


    public ServicoPlanejamentoDetalhado(String nomeServico, String responsavel, int duracaoDias, String materiaisNecessarios) {
        super(nomeServico, responsavel, duracaoDias);
        this.materiaisNecessarios = materiaisNecessarios;
    }


    public String getMateriaisNecessarios() {
        return materiaisNecessarios;
    }

    public void setMateriaisNecessarios(String materiaisNecessarios) {
        this.materiaisNecessarios = materiaisNecessarios;
}
}



