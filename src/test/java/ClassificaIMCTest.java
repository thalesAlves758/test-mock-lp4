import org.easymock.EasyMock.*;
import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;

class ClassificaIMCTest {

    @Test
    public void testeSexoInvalido() {
        try {
            Pessoa pessoa = new Pessoa(1.0, 1.0, "X");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Sexo inválido", e.getMessage());
        }
    }

    @Test
    public void testeAbaixoPesoMasculino() {
        IPessoa pessoaMock = createMock(IPessoa.class);
        expect(pessoaMock.getSexo()).andReturn("M");
        expect(pessoaMock.calcularIMC()).andReturn(20.6);
        replay(pessoaMock);

        String resultado = ClassificaIMC.classificar(pessoaMock);

        assertEquals("abaixo do peso", resultado);
    }

    @Test
    public void testePesoNormalMasculino() {
        IPessoa pessoaMock = createMock(IPessoa.class);
        expect(pessoaMock.getSexo()).andReturn("M");
        expect(pessoaMock.calcularIMC()).andReturn(26.3);
        replay(pessoaMock);

        String resultado = ClassificaIMC.classificar(pessoaMock);

        assertEquals("no peso normal", resultado);
    }

    @Test
    public void testeMarginalmentePesoMasculino() {
        IPessoa pessoaMock = createMock(IPessoa.class);
        expect(pessoaMock.getSexo()).andReturn("M");
        expect(pessoaMock.calcularIMC()).andReturn(27.7);
        replay(pessoaMock);

        String resultado = ClassificaIMC.classificar(pessoaMock);

        assertEquals("marginalmente acima do peso", resultado);
    }

    @Test
    public void testePesoAcimaMasculino() {
        IPessoa pessoaMock = createMock(IPessoa.class);
        expect(pessoaMock.getSexo()).andReturn("M");
        expect(pessoaMock.calcularIMC()).andReturn(31.0);
        replay(pessoaMock);

        String resultado = ClassificaIMC.classificar(pessoaMock);

        assertEquals("acima do peso ideal", resultado);
    }

    @Test
    public void testePesoObesoMasculino() {
        IPessoa pessoaMock = createMock(IPessoa.class);
        expect(pessoaMock.getSexo()).andReturn("M");
        expect(pessoaMock.calcularIMC()).andReturn(31.1);
        replay(pessoaMock);

        String resultado = ClassificaIMC.classificar(pessoaMock);

        assertEquals("Obeso", resultado);
    }

    @Test
    public void testeAbaixoPesoFeminino() {
        IPessoa pessoaMock = createMock(IPessoa.class);
        expect(pessoaMock.getSexo()).andReturn("F");
        expect(pessoaMock.calcularIMC()).andReturn(19.0);
        replay(pessoaMock);

        String resultado = ClassificaIMC.classificar(pessoaMock);

        assertEquals("abaixo do peso", resultado);
    }

    @Test
    public void testePesoNormalFeminino() {
        IPessoa pessoaMock = createMock(IPessoa.class);
        expect(pessoaMock.getSexo()).andReturn("F");
        expect(pessoaMock.calcularIMC()).andReturn(25.7);
        replay(pessoaMock);

        String resultado = ClassificaIMC.classificar(pessoaMock);

        assertEquals("no peso normal", resultado);
    }

    @Test
    public void testeMarginalmentePesoFeminino() {
        IPessoa pessoaMock = createMock(IPessoa.class);
        expect(pessoaMock.getSexo()).andReturn("F");
        expect(pessoaMock.calcularIMC()).andReturn(27.2);
        replay(pessoaMock);

        String resultado = ClassificaIMC.classificar(pessoaMock);

        assertEquals("marginalmente acima do peso", resultado);
    }

    @Test
    public void testePesoAcimaFeminino() {
        IPessoa pessoaMock = createMock(IPessoa.class);
        expect(pessoaMock.getSexo()).andReturn("F");
        expect(pessoaMock.calcularIMC()).andReturn(32.2);
        replay(pessoaMock);

        String resultado = ClassificaIMC.classificar(pessoaMock);

        assertEquals("acima do peso ideal", resultado);
    }
    @Test
    public void testePesoObesoFeminino() {
        IPessoa pessoaMock = createMock(IPessoa.class);
        expect(pessoaMock.getSexo()).andReturn("F");
        expect(pessoaMock.calcularIMC()).andReturn(32.3);
        replay(pessoaMock);

        String resultado = ClassificaIMC.classificar(pessoaMock);

        assertEquals("Obeso", resultado);
    }
}
