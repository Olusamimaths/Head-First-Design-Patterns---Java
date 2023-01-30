package head_first_design_patterns.chapter_3.condiments;

import head_first_design_patterns.chapter_3.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage; // any beverage can be wrapped
    public abstract String getDescription(); // condiment decorators must reimplement getDescription
}
