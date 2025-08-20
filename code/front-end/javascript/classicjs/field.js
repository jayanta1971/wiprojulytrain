
function handleClick(flg)
{
document.getElementById("sp1").style.visibility = "hidden";
//     document.getElementById("txt1").disabled=true;
    // if(flg == 1)
    //     document.getElementById("sp1").style.visibility = "visible";
    // else
    // document.getElementById("sp1").style.visibility = "hidden";


}

function handleBlur()
{
    let valueText= document.getElementById("txt1").value ;
    console.log("valueText="+ valueText);
    if(valueText == "")
    { 
        console.log("Empty value");
        document.getElementById("sp1").style.visibility = "visible";
    }

}

function checkText()
{
let valueText= document.getElementById("txt1").value ;
 if(valueText == "")
    {
        console.log("Empty value");
        document.getElementById("sp1").style.visibility = "visible";
    }
    else
    {
        console.log("Not empty value");
        document.getElementById("sp1").style.visibility = "hidden";
    }

}