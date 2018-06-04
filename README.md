# PracticaFinal
Diagrama de casos de uso
<img src="https://i.gyazo.com/ea906e8dc54e4eda4bad4f5192591d58.png" style="max-width:100%;">

DIAGRAMA DE CLASES:
<img src="https://i.gyazo.com/78db373f843adfa1e6623f5690ce7420.png" style="max-width:100%;">
SECUENCIAS:

•	Dar de Alta Articulo:

  o	Secuencia normal: introduce datos, se guarda el artículo correctamente.
  
  o	Secuencia Alternativa:
  
    	introduce datos y alguno está mal. “ERROR en campo X”; 
    	Algún campo vacío: “ERROR, campo X vacío”; 
    	Articulo repetido. “ERROR, el artículo ya existe”; 
    	El usuario se equivoca de acción.

•	Buscar articulo almacenado:

  o	SN: escribes el artículo, el artículo existe y lo encuentra.
  
  o	SA:
  
    	escribes un artículo y no existe.
    	Buscar con el campo vacío.
    	Caracteres erróneos.
    	El usuario se equivoca de acción.
    
•	Modificar Precio:

  o	SN: buscas el artículo, escribes el nuevo precio, confirmas la acción, el antiguo pasa al histórico y se guarda el nuevo.
  o	SA:
  
    	Introducir caracteres inválidos.
    	Mete el mismo precio.
    	Campo vacío.
    	El usuario se equivoca de acción.
    
•	Dar Alta Cliente:

  o	Secuencia normal: introduce datos, se guarda el cliente correctamente.
  
  o	Secuencia Alternativa:
  
    	introduce datos y alguno está mal. “ERROR en campo X”; 
    	Algún campo vacío: “ERROR, campo X vacío”; 
    	Cliente repetido. “ERROR, el cliente ya existe”; 
    	El usuario se equivoca de acción.
•	Buscar Cliente:

  o	SN: escribes el cliente, el cliente existe y lo encuentra.
  
  o	SA:
  
    	escribes un cliente y no existe.
    	Buscar con el campo vacío.
    	Caracteres erróneos.
    	El usuario se equivoca de acción.
•	Borrar Cliente:

  o	SN: Elige el cliente, confirmas la acción y lo elimina junto a sus pedidos.
  
  o	SA:
  
    	No confirma el borrado.
    	El usuario se equivoca de acción.
    
•	Dar Alta Pedido:

  o	Secuencia normal: introduce datos, se guarda el pedido correctamente.
  
  o	Secuencia Alternativa:
  
    	introduce datos y alguno está mal. “ERROR en campo X”; 
    	Algún campo vacío: “ERROR, campo X vacío”; 
    	pedido repetido. “ERROR, el cliente ya existe”; 
    	El usuario se equivoca de acción.
    
•	Consultar Pedido:

  o	SN: escribes el pedido, el pedido existe y lo encuentra.
  
  o	SA:
  
    	escribes un pedido y no existe.
    	Buscar con el campo vacío.
    	Caracteres erróneos.
    	El usuario se equivoca de acción.

