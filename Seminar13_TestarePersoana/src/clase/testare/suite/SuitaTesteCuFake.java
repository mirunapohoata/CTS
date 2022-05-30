package clase.testare.suite;


import clase.testare.categorii.TesteBoundary;
import clase.testare.categorii.TesteCuFake;
import clase.testare.categorii.TestePoateRezerva;
import clase.testare.teste.AgentieTurismTest;
import clase.testare.teste.PachetTuristicTest;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class) // cauta toate metodele cu @Test si tine cont de @Category
@Suite.SuiteClasses({AgentieTurismTest.class, PachetTuristicTest.class})
@Categories.IncludeCategory(TesteCuFake.class) // categoria pe care vrem sa o caute runnerul
@Categories.ExcludeCategory({TesteBoundary.class, TestePoateRezerva.class})
public class SuitaTesteCuFake {
}
