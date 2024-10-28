import React from 'react';
import { products,getProductsData } from '../utils/products';
import '../utils/Productsdb'
function ExampleComponent() {

    const products=getProductsData();
  return (
    <div>
      <h1>Product List from Utils</h1>
      <ul>
        {products.map(product => (
          <li key={product.id}>
            <h2>{product.name}</h2>
            <p>{product.shortDescription}</p>
            <p>{product.longDescription}</p>
            <p>Price: ${product.price}</p>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default ExampleComponent;