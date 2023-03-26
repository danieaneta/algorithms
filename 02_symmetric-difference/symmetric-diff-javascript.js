function symmetricDifference(setA, setB) {
  //Creation of new set "difference" from setA using the set() method. 
  let difference = new Set(setA);
  
  //Iterating through all elements of "setB." 
  for (let elem of setB) {
    //Checking to see if "difference" already contains the element using the "has()" method.
    if (difference.has(elem)) {
      //If difference contains the element (element is present in both sets), then it removes the element from "difference" using the "delete()" meothd.
      difference.delete(elem);
    } else {
      //If element IS NOT present, then the element will be added using the "add()" method. 
      difference.add(elem);
    }
  }
  return difference;
}
