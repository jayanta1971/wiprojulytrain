
var listEmployee = [
  {
    name: "John Doe",
    age: 30,
    position: "Software Engineer",
  },
  {
    name: "Mark Freeman",
    age: 32,
    position: "Software Engineer",
  },
  {
    name: "Patricia  Dark",
    age: 35,
    position: "Accounts",
  }]
 
 for(let i = 0; i < listEmployee.length; i++) {
    if(i%2==0)
    {
        listEmployee[i].status = "active";
    }else
    {
        listEmployee[i].status = "inactive";
    }

   
 }

 console.log(listEmployee);