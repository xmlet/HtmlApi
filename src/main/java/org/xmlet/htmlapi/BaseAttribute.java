package org.xmlet.htmlapi;

public class BaseAttribute<T> implements Attribute<T> {
   private T value;
   private String name;

   public BaseAttribute(T value, String name) {
      this.value = value;
      this.name = name;
   }

   public T getValue() {
      return this.value;
   }

   public String getName() {
      return this.name;
   }
}
