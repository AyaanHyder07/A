import React, { useState } from "react"; 
const ProductForm = () => { 
  const [productName, setProductName] = useState(""); 
  const [description, setDescription] = useState(""); 
  const [price, setPrice] = useState(""); 
 
  const handleSubmit = (event) => { 
    event.preventDefault(); 
    console.log("Product Name:", productName); 
    console.log("Description:", description); 
    console.log("Price:", price); 
  }; 
 
  return ( 
    <form onSubmit={handleSubmit}> 
      <h2>Add Product</h2> 
 
      <div> 
        <label htmlFor="productName">Product Name:</label> 
        <input 
          type="text" 
          id="productName" 
          value={productName} 
          onChange={(e) => setProductName(e.target.value)} 
          required 
        /> 
      </div><br/> 
 
    <div> 
 
      <label htmlFor="description">Description:</label> 
      <textarea 
        id="description" 
        value={description} 
        onChange={(e) => setDescription(e.target.value)} 
        required 
      /> 
    </div><br/> 
 
      <div style={{ marginBottom: "10px" }}> 
        <label htmlFor="price">Price:</label> 
        <input 
          type="number" 
          id="price" 
          value={price} 
          onChange={(e) => setPrice(e.target.value)} 
          required 
        /> 
      </div><br/> 
      <button type="submit">Add Product</button> 
    </form> 
  ); 
}; 
export default ProductForm;  