package org.xmlet.htmlapi;

public class Html<Z extends Element> extends AbstractElement<Html<Z>, Z> implements CommonAttributeGroup<Html<Z>, Z>, HtmlChoice0<Html<Z>, Z> {
   public Html() {
      super("html");
   }

   public Html(String name) {
      super(name);
   }

   public Html(Z parent) {
      super(parent, "html");
   }

   public Html(Z parent, String name) {
      super(parent, name);
   }

   public Html<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Html<Z> cloneElem() {
      return (Html)this.clone(new Html());
   }

   public Html<Z> attrManifest(String attrManifest) {
      return (Html)this.addAttr(new AttrManifestString(attrManifest));
   }
}
