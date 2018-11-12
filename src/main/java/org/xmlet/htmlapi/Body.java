package org.xmlet.htmlapi;

public class Body<Z extends Element> extends AbstractElement<Body<Z>, Z> implements CommonAttributeGroup<Body<Z>, Z>, FlowContentChoice<Body<Z>, Z> {
   public Body() {
      super("body");
   }

   public Body(String name) {
      super(name);
   }

   public Body(Z parent) {
      super(parent, "body");
   }

   public Body(Z parent, String name) {
      super(parent, name);
   }

   public Body<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Body<Z> cloneElem() {
      return (Body)this.clone(new Body());
   }

   public Body<Z> attrOnafterprint(java.lang.Object attrOnafterprint) {
      return (Body)this.addAttr(new AttrOnafterprintObject(attrOnafterprint));
   }

   public Body<Z> attrOnbeforeprint(java.lang.Object attrOnbeforeprint) {
      return (Body)this.addAttr(new AttrOnbeforeprintObject(attrOnbeforeprint));
   }

   public Body<Z> attrOnbeforeunload(java.lang.Object attrOnbeforeunload) {
      return (Body)this.addAttr(new AttrOnbeforeunloadObject(attrOnbeforeunload));
   }

   public Body<Z> attrOnhashchange(java.lang.Object attrOnhashchange) {
      return (Body)this.addAttr(new AttrOnhashchangeObject(attrOnhashchange));
   }

   public Body<Z> attrOnmessage(java.lang.Object attrOnmessage) {
      return (Body)this.addAttr(new AttrOnmessageObject(attrOnmessage));
   }

   public Body<Z> attrOnoffline(java.lang.Object attrOnoffline) {
      return (Body)this.addAttr(new AttrOnofflineObject(attrOnoffline));
   }

   public Body<Z> attrOnonline(java.lang.Object attrOnonline) {
      return (Body)this.addAttr(new AttrOnonlineObject(attrOnonline));
   }

   public Body<Z> attrOnpopstate(java.lang.Object attrOnpopstate) {
      return (Body)this.addAttr(new AttrOnpopstateObject(attrOnpopstate));
   }

   public Body<Z> attrOnredo(java.lang.Object attrOnredo) {
      return (Body)this.addAttr(new AttrOnredoObject(attrOnredo));
   }

   public Body<Z> attrOnresize(java.lang.Object attrOnresize) {
      return (Body)this.addAttr(new AttrOnresizeObject(attrOnresize));
   }

   public Body<Z> attrOnstorage(java.lang.Object attrOnstorage) {
      return (Body)this.addAttr(new AttrOnstorageObject(attrOnstorage));
   }

   public Body<Z> attrOnundo(java.lang.Object attrOnundo) {
      return (Body)this.addAttr(new AttrOnundoObject(attrOnundo));
   }

   public Body<Z> attrOnunload(java.lang.Object attrOnunload) {
      return (Body)this.addAttr(new AttrOnunloadObject(attrOnunload));
   }
}
