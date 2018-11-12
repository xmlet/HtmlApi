package org.xmlet.htmlapi;

public class Article<Z extends Element> extends AbstractElement<Article<Z>, Z> implements CommonAttributeGroup<Article<Z>, Z>, FlowContentChoice<Article<Z>, Z> {
   public Article() {
      super("article");
   }

   public Article(String name) {
      super(name);
   }

   public Article(Z parent) {
      super(parent, "article");
   }

   public Article(Z parent, String name) {
      super(parent, name);
   }

   public Article<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Article<Z> cloneElem() {
      return (Article)this.clone(new Article());
   }

   public Article<Z> attrPubdate(java.lang.Object attrPubdate) {
      return (Article)this.addAttr(new AttrPubdateObject(attrPubdate));
   }
}
