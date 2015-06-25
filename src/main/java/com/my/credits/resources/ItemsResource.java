package com.my.credits.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.my.credits.core.Item;
import com.my.credits.data.services.ItemDataService;

@Path("/credits")
public class ItemsResource {
	
	private ItemDataService itemDataService = null;
	public ItemsResource() {
		itemDataService = new ItemDataService();
	}

	@GET
    @Path("items")
    @Produces(MediaType.APPLICATION_JSON)
    public String getItems(@PathParam("userid") int userid) throws Exception {
		if (userid != 1010) throw new Exception("invalid userid!");
		List<Item> items = itemDataService.getItemsbyUserId(userid);
        return "Test";
    }

	@POST
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public String getItems(@PathParam("userid") int userid, Item item) throws Exception {
		if (userid != 1010) throw new Exception("invalid userid!");
		
        return "Test";
    }
}
