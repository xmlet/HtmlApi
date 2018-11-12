package org.xmlet.htmlapi;

import java.util.function.Function;

public class TextFunction<R, U, Z extends Element> extends AbstractElement<TextFunction<R, U, Z>, Z> {
   private Function<R, U> textFunction;

   private TextFunction() {
      super("text");
   }

   public TextFunction(Z parent, Function<R, U> textFunction) {
      super(parent, "text");
      this.textFunction = textFunction;
   }

   public TextFunction<R, U, Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public U getValue(R model) {
      return this.textFunction == null ? null : this.textFunction.apply(model);
   }

   public TextFunction<R, U, Z> cloneElem() {
      return (TextFunction)this.clone(new TextFunction());
   }

   public TextFunction addAttr(Attribute var1) {
      throw new UnsupportedOperationException("Text element can't contain attributes.");
   }

   public TextFunction addChild(Element var1) {
      throw new UnsupportedOperationException("Text element can't contain children.");
   }
}
