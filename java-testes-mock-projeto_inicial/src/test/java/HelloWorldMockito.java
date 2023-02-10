import br.com.alura.leilao.dao.LeilaoDao;
import br.com.alura.leilao.model.Leilao;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


public class HelloWorldMockito {




  @Test
  public void hello() {

    LeilaoDao mock = Mockito.mock(LeilaoDao.class);
    List<Leilao> todos = mock.buscarTodos();

    Assert.assertTrue(todos.isEmpty());
  }


/**
 * Mock: Classe que simula comportamentos de outra classe
 */

