<!DOCTYPE html>

<html>
<body>


<?php


    $mas1 = array(4, 5, -3, 15, -2, 19, 6, -2, -4, 20, -17);
    
    /* negative */
    
        foreach ($mas1 as $value_1) {
        if ($value_1  < 0) {
            $negative[] = $value_1;
            $xx =  $negative;
        }
    }
    
    /* positive */
    
            foreach ($mas1 as $value_2) {
        if ($value_2  > 0) {
            $positive[] = $value_2;
            $yy =  $positive;
        }
    }
    
    
    /* odds */
    
    foreach ($mas1 as $value_3) {
        if ($value_3 % 2 == 0) {
            $odds[] = $value_3;
            $zz =  $odds;
        }
    }
    
   
    
    /*even*/
    
    foreach ($mas1 as $value_4) {
        if ($value_4 % 2 != 0) {
           $even[] = $value_4;
           $ww = $even;
        }
    }
    
    
 
    // $comma_separated = implode(",", $ww);
    // echo $comma_separated. "\n";
    //$comma_separated_2 = implode(",", $zz);
    //echo $comma_separated_2 . "\n";
    //echo $ww = $even . '\n';
     
     $x = count($xx);
    // echo $x ."\n" ;
     $y = count($yy);
    // echo $y . "\n" ;
     $z = count($zz);
    // echo $z ."\n" ;
     $w = count($ww);
    // echo $w . "\n" ;
     
     print("Array has $x negative, $y positive, $z odd and $w even numbers")
     
     

?>
 
</body>
</html>
