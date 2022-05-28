Item = [

        ]

for NameHelper in Item:
    Icon = '''
    {
      "parent": "item/generated",
      "textures": {
        "layer0": "with_fire:item/%s"
      }
    }
    '''%NameHelper

    with open('./%s.json'%NameHelper, 'w') as json:
        json.write(Icon)